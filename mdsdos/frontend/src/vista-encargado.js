import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';

/**
 * `vista-encargado`
 *
 * VistaEncargado element.
 *
 * @customElement
 * @polymer
 */
class VistaEncargado extends PolymerElement {

    static get template() {
        return html`
            <style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
                }
            </style>
        `;
    }

    static get is() {
        return 'vista-encargado';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaEncargado.is, VistaEncargado);
