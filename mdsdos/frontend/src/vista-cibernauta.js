import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';

/**
 * `vista-cibernauta`
 *
 * VistaCibernauta element.
 *
 * @customElement
 * @polymer
 */
class VistaCibernauta extends PolymerElement {

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
        return 'vista-cibernauta';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaCibernauta.is, VistaCibernauta);
